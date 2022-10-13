/**
 * patient 暂为固定值。
 * 其余全部未实现
 * 
 * @param patient  特定病患信息
 * @param type     请求种类
 * @param from     时间开始点
 * @param to       时间结束点
 * @param gap      时间单位
 * @returns
 */
function makeRequest( patientId, type, from =null,  to =null, gap =null){
	return {
		patientId: patientId,
	}
};

/**
 * Ajax 请求
 * 
 * @param url     
 * @param request_data    来自 makeRequest 函数
 * @param callback
 * @returns
 */
function jsonPost( url, request_data, callback=(x)=>{return x}){

	$.ajax({
		url: url,
		data: JSON.stringify(request_data),
		type : "post",
		dataType : "json",
		contentType : 'application/json',
		close : true,
		success: function( response ) {
			if (response.code == '500') {
				dialogAlert(response.msg, 'error');
			} else if (response.code == '0') {

				//dialogMsg(response.msg, 'success');

				callback(response.content); // 注意返回数据的结构

				//options.success(response);
				/*if (options.close == true) {
					dialogClose();
				}*/
				return
			}
			else{
				$.alert("failed\n")
			}
		}
	})
}



var TITLE = "实时血压";			// echart 标题
var TITLE1 = "实时心率";
var TITLE2 = "实时心情";
var TITLE3 = "实时运动";

var mood = new Array('开心','惊讶','沮丧','悲伤','恐惧','愤怒');
var sports = new Array('躺','坐','站','走路','慢跑','上下楼梯');

var X_DATA_LENGTH = 10;			// x轴数据的数量，也就是横轴时间


var Y_MAX = 180;					// y轴数据最大值
var INTERVAL = 1000;			// 更新echart 的时间间隔，单位毫秒

// 这个 default 意味着，其它js调用它的时候好像是可以随便起名的。 
export default{
	
	template: `
		<div class="row">
		<div style="text-align:center;color:white;font-size:40px;width:100%;height:50px;background-color: #40E0D0
;">
		<span>血压：{{realtime_sbp}} / {{realtime_dbp}}&nbsp</span>
		<span>心率：{{realtime_heartrate}}</span>
		</div>
			<div id="bpChart" style="height:200px;width:100%;"></div>
			<div id="heartratechart" style="height:200px;width:100%;"></div>
			<div id="moodChart" style="height:200px;width:100%;"></div>
			<div id="sportsChart" style="height:200px;width:100%;"></div>
		</div>
	`,
	data() {
        return{
            xData:null,			// 保存当前的x轴数据，是一个列表[]，也就是时间
            ySbpData:null,
            yDbpData:null,      // y轴
            yHeartrateData:null,
            yMoodData:null,
            ySportsData:null,
            realtime_sbp:129,
    		realtime_dbp:80,
    		realtime_heartrate:69
        }
    },
    props: {
//        echartObj: {
//            type: Object,
//            default: {}
//        }
    	patientId: null,		// 传入 patientId，这里是驼峰的，vue prop 传驼峰的值好像有问题
    },
    created() {
    	let _this = this;
        this.$nextTick(()=> {
        	// 将数据初始化
        	_this.xData = new Array(X_DATA_LENGTH).fill("xx:xx:xx");
        	_this.ySbpData = new Array(X_DATA_LENGTH).fill(0);
        	_this.yDbpData = new Array(X_DATA_LENGTH).fill(0);
        	_this.yHeartrateData = new Array(X_DATA_LENGTH).fill(0);
        	_this.yMoodData = new Array(X_DATA_LENGTH).fill(0);
        	_this.ySportsData = new Array(X_DATA_LENGTH).fill(0);
        	
        	// 画出初始的图
            _this.loadChart();
        })
    },
    mounted(){
        let _this = this;
        
        // echart 在窗口大小改变时，自动调整大小
        window.onresize = function() {
            _this.myChart.resize();
        };
        
        // 定时器，setInterval 函数是 js 原生的库函数
        this.timer = setInterval(function(){
    		_this.update();
    	}, INTERVAL);
    },
    methods: {
    	
    	// 画echart
        loadChart() {
            this.myChart = echarts.init(document.getElementById("bpChart"));
            this.myChart.setOption({
                title: {
                    text: TITLE
                },
                legend:{
                	formatter: function (name) {
                	    if(name =="收缩压"){
                	    	return name + ":";
                	    }
                	    if(name =="舒张压"){
                	    	return name+ ":";
                	    }
                	}
                },
                tooltip: {trigger:'axis'},
                visualMap: [{
                    seriesIndex: 0,
            		show: false,
                    pieces: [{
                        gt: 0,
                        lte: 120,
                        color: '#096'
                    }, {
                        gt: 120,
                        lte: 140,
                        color: '#ff9933'
                    },{
                        gt: 140,
                        color: 'red'
                    }],
                    outOfRange: {
                        color: 'red'
                    }
                },
                {
                	seriesIndex: 1,
            		show: false,
                    pieces: [{
                        gt: 0,
                        lte: 80,
                        color: '#096'
                    }, {
                        gt: 80,
                        lte: 90,
                        color: '#ff9933'
                    },{
                        gt: 90,
                        color: 'red'
                    }],
                    outOfRange: {
                        color: 'red'
                    }
                }],
                xAxis: {
                	//type:'category',
                    data: this.xData
                },
                yAxis: {
                	type: 'value'
                },
                series: [
                	{
                	name:"收缩压",
                    type: 'line',
                    data: this.ySbpData
                  },
                  {
                      name:"舒张压",
                      type: 'line',
                      data: this.yDbpData
                  }
                ]
            });
            
            this.myChart1 = echarts.init(document.getElementById("heartratechart"));
            this.myChart1.setOption({
                title: {
                    text: TITLE1
                },
                legend:{
                	formatter: function (name) {
                	    return name + ":"
                	}
                },
                tooltip: {},
                visualMap: {
                    seriesIndex: 0,
            		show: false,
                    pieces: [{
                        gt: 60,
                        lte: 100,
                        color: '#096'
                    }, {
                        gt: 120,
                        lte: 140,
                        color: '#ff9933'
                    },{
                        gt: 140,
                        color: 'red'
                    }],
                    outOfRange: {
                        color: 'red'
                    }
                },
                xAxis: {
                	//type:'category',
                    data: this.xData
                },
                yAxis: {
                	type: 'value'
                },
                series: [
                	{
                	name:"实时心率",
                    type: 'line',
                    data: this.yHeartrateData
                  }
                ]
            });
            
            this.myChart2 = echarts.init(document.getElementById("moodChart"));
            this.myChart2.setOption({
                title: {
                    text: TITLE2
                },
                legend:{
                	formatter: function (name) {
                	    return name + ":"
                	}
                },
                tooltip: {},
                visualMap: {
                    seriesIndex: 0,
            		show: false,
                    pieces: [{
                        gt: 0,
                        lte: 1,
                        color: '#096'
                    }, {
                        gt: 2,
                        lte: 3,
                        color: '#ff9933'
                    },{
                        gt: 3,
                        color: 'red'
                    }],
                    outOfRange: {
                        color: 'red'
                    }
                },
                xAxis: {
                	//type:'category',
                    data: this.xData
                },
                yAxis: {
                	type: 'value',
                	 axisLabel: {
         	        	formatter: function (value) {
         	        		var texts = [];
         	        		if(value === 0){
         	        			texts.push('开心');
         	        		}
         	        		else if (value === 1) {
         	        			texts.push('惊讶');
         	        		}
         	        		else if (value === 2) {
         	        			texts.push('沮丧');
         	        		}
         	        		else if(value === 3){
         	        			texts.push('伤心');
         	        		}
         	        		else if(value === 4){
         	        			texts.push('恐惧');
         	        		}
         	        		else{
         	        			texts.push('愤怒');
         	        		}
         	        		return texts;
         	        	},
         	            textStyle: {
         	                color: '#999'
         	            }
         	        }
                },
                
                series: [
                	{
                	name:"实时心情",
                    type: 'line',
                    step: 'middle',
                    data: this.yMoodData
                  }
                ]
            });
            
            this.myChart3 = echarts.init(document.getElementById("sportsChart"));
            this.myChart3.setOption({
                title: {
                    text: TITLE3
                },
                legend:{
                	formatter: function (name) {
                	    return name + ":"
                	}
                },
                tooltip: {},
                visualMap: {
                    seriesIndex: 0,
            		show: false,
                    pieces: [{
                        gt: 0,
                        lte: 2,
                        color: '#096'
                    }, {
                        gt: 3,
                        lte: 4,
                        color: '#ff9933'
                    },{
                        gt: 4,
                        color: 'red'
                    }],
                    outOfRange: {
                        color: 'red'
                    }
                },
                xAxis: {
                	//type:'category',
                    data: this.xData
                },
                yAxis: {
                	type: 'value',
                	 axisLabel: {
         	        	formatter: function (value) {
         	        		var texts = [];
         	        		if(value == 0){
         	        			texts.push('躺');
         	        		}
         	        		else if (value == 1) {
         	        			texts.push('坐');
         	        		}
         	        		else if (value == 2) {
         	        			texts.push('站');
         	        		}
         	        		else if(value == 3){
         	        			texts.push('走路');
         	        		}
         	        		else if(value == 4){
         	        			texts.push('慢跑');
         	        		}
         	        		else{
         	        			texts.push('上下楼梯');
         	        		}
         	        		return texts;
         	        	},
         	            textStyle: {
         	                color: '#999'
         	            }
         	        }
                },
                
                series: [
                	{
                	name:"实时运动",
                    type: 'line',
                    step: 'middle',
                    data: this.ySportsData
                  }
                ]
            });
        },
        
        // 每过 INTERVAL 毫秒，就会调用一次这个update函数
        update(){
        	// 原本应该请求后台数据，暂时先省略
        	
        	
        	// 下面这段代码是随机生成数据，改变xdata，ydata 再重新画图
        	
        	let _this = this;
        	var newSbpValue = 90 + (Math.floor(Math.random() * 10000))% 90;   // 随机的 Y 值
        	var newDbpValue = 40 + (Math.floor(Math.random() * 10000))% 50 ;
        	var newValue = (Math.floor(Math.random() * 10000))% 150;
        	var newMoodValue = (Math.floor(Math.random() * 10000)) % 6;
        	var newSportsValue = (Math.floor(Math.random() * 10000)) % 6;
        	var t = new Date();
        	var newDate = t.toLocaleString('chinese', { hour12: false }).substr(10);				// 现在的时间
     	
//        	$.ajax({
//				url: "../../hypertension/monitor/latestinfo",
//				data: JSON.stringify(   this.patientId  ),
//				type: "post",
//				dataType: "json",
//        	    async:false,
//				close: true,
//				contentType:'application/json',
//				success: function( data ){
//					newSbpValue = data.rows.systolicBp;
//					newDbpValue = data.rows.diastolicBp;
//					newValue = data.rows.heartrate;
//		        	
//				}
//			});

        	// 本来的 data 是 0~9， 先变成  1~9， 也就是去掉了第一个。 再 push 一个到末尾。
        	var newX = _this.xData;
        	newX = newX.slice(1, X_DATA_LENGTH);
        	newX.push( newDate );
        	
        	var newYSbp = _this.ySbpData;
        	newYSbp = newYSbp.slice(1, X_DATA_LENGTH);
        	newYSbp.push( newSbpValue );
        	
        	var newYDbp = _this.yDbpData;
        	newYDbp = newYDbp.slice(1, X_DATA_LENGTH);
        	newYDbp.push( newDbpValue );
        	
        	var newY = _this.yHeartrateData;
        	newY = newY.slice(1, X_DATA_LENGTH);
        	newY.push( newValue );
        	
        	var newMood = _this.yMoodData;
        	newMood = newMood.slice(1, X_DATA_LENGTH);
        	newMood.push( newMoodValue );
        	
        	var newSports = _this.ySportsData;
        	newSports = newSports.slice(1, X_DATA_LENGTH);
        	newSports.push( newSportsValue );

        	// 更新 data 然后画图
        	_this.xData = newX;
        	_this.ySbpData = newYSbp;
        	_this.yDbpData = newYDbp;
        	_this.yHeartrateData = newY;
        	_this.yMoodData = newMood;
        	_this.ySportsData = newSports;
        	console.log(_this.yMoodData);
        	console.log(_this.ySportsData);
        	
        	_this.realtime_sbp = newSbpValue;
        	_this.realtime_dbp = newDbpValue;
        	_this.realtime_heartrate = newValue;
        	_this.loadChart();
        	
        	this.myChart.setOption({
        		textStyle: { //图例文字的样式
                    fontSize: 25
                },
                legend:{
                	formatter: function (name) {
                	    if(name =="收缩压"){
                	    	return name + ": " + newSbpValue;
                	    }
                	    if(name =="舒张压"){
                	    	return name+ ": " + newDbpValue;
                	    }
                	}
                }
        	});
        	this.myChart1.setOption({
        		textStyle: { //图例文字的样式
                    fontSize: 25
                },
                legend:{
                	formatter: function (name) {
                	    return name + ": " + newValue;
                	}
                }
        	});
        	
        	this.myChart2.setOption({
        		
        		textStyle: { //图例文字的样式
                    fontSize: 25
                },
                legend:{
                	formatter: function (name) {
                	    return name + ": " + mood[newMoodValue];
                	}
                }
        	});
        	
        	this.myChart3.setOption({
        		
        		textStyle: { //图例文字的样式
                    fontSize: 25
                },
                legend:{
                	formatter: function (name) {
                	    return name + ": " + sports[newSportsValue];
                	}
                }
        	});
        }
    }

	
	
}