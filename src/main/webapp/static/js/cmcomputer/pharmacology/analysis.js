/**
 * js
 */

$(function () {
    initialPage();
});

function initialPage() {
    // $(window).resize(function() {
    //     $('#dataGrid').bootstrapTable('resetView', {height: $(window).height()-56});
    // });
}

var vm = new Vue({
    el:'#dpLTE',
    data: {
        keyword: null
    },
    methods : {

    }
})

var graph = {
    "nodes": [
        {
            "id": "0",
            "name": "矮地茶",
            "symbolSize": 19.12381,
            "x": -266.82776,
            "y": 299.6904,
            "value": 28.685715,
            "category": 0
        },
        {
            "id": "1",
            "name": "3-Hexynol",
            "symbolSize": 12.6666666666666665,
            "x": -418.08344,
            "y": 446.8853,
            "value": 4,
            "category": 1
        },
        {
            "id": "2",
            "name": "Myricetin",
            "symbolSize": 16.323809333333333,
            "x": -212.76357,
            "y": 245.29176,
            "value": 9.485714,
            "category": 1
        },
        {
            "id": "3",
            "name": "IFNG",
            "symbolSize": 16.323809333333333,
            "x": -242.82404,
            "y": 235.26283,
            "value": 9.485714,
            "category": 2
        },
        {
            "id": "4",
            "name": "NR3C2",
            "symbolSize": 12.6666666666666665,
            "x": -379.30386,
            "y": 429.06424,
            "value": 4,
            "category": 2
        },
        {
            "id": "5",
            "name": "Ovarian Cysts",
            "symbolSize": 12.6666666666666665,
            "x": -417.26337,
            "y": 406.03506,
            "value": 4,
            "category": 3
        },
        {
            "id": "6",
            "name": "Acne",
            "symbolSize": 12.6666666666666665,
            "x": -332.6012,
            "y": 485.16974,
            "value": 4,
            "category": 3
        }
    ],
    "links": [
        {
            "source": "0",
            "target": "1"
        },
        {
            "source": "0",
            "target": "2"
        },
        {
            "source": "1",
            "target": "3"
        },
        {
            "source": "1",
            "target": "4"
        },
        {
            "source": "2",
            "target": "3"
        },
        {
            "source": "4",
            "target": "5"
        },
        {
            "source": "4",
            "target": "6"
        },
        {
            "source": "3",
            "target": "5"
        },
        {
            "source": "5",
            "target": "6"
        }
    ],
    "categories": [
        {
            "name": "herb"
        },
        {
            "name": "ingredient"
        },
        {
            "name": "target"
        },
        {
            "name": "disease"
        }
    ]
}

var relationChart = echarts.init(document.getElementById('relation'));
graph.nodes.forEach(function (node) {
    node.label = {
        show: node.symbolSize > 30
    };
});
let option1 = {
    title: {
        text: '药理网络图',
    },
    tooltip: {},
    legend: [
        {
            data: graph.categories.map(function (a) {
                return a.name;
            })
        }
    ],
    animationDurationUpdate: 1500,
    animationEasingUpdate: 'quinticInOut',
    series: [
        {
            name: 'Les Miserables',
            type: 'graph',
            layout: 'circular',
            circular: {
                rotateLabel: true
            },
            data: graph.nodes,
            links: graph.links,
            categories: graph.categories,
            roam: true,
            label: {
                position: 'right',
                formatter: '{b}'
            },
            lineStyle: {
                color: 'source',
                curveness: 0.3
            }
        }
    ]
};
relationChart.setOption(option1);

var dieseaseBarChart = echarts.init(document.getElementById('dieseaseBar'));
let option2 = {
    title: {
        text: '病症-药理（分子）',
        left: 'center'
    },
    tooltip: {
        trigger: 'item'
    },
    legend: {
        orient: 'vertical',
        left: 'left'
    },
    series: [
        {
            name: 'Access From',
            type: 'pie',
            radius: '50%',
            data: [
                { value: 1048, name: 'A2M' },
                { value: 735, name: 'MIR601' },
                { value: 580, name: 'DPY30' },
                { value: 484, name: 'SCN3B' },
                { value: 1300, name: 'ABO' }
            ],
            emphasis: {
                itemStyle: {
                    shadowBlur: 10,
                    shadowOffsetX: 0,
                    shadowColor: 'rgba(0, 0, 0, 0.5)'
                }
            }
        }
    ]
};
dieseaseBarChart.setOption(option2);


var dieseaseStripeChart = echarts.init(document.getElementById('dieseaseStripe'));
let option3 = {
    tooltip: {
        trigger: 'axis',
        axisPointer: {
            // Use axis to trigger tooltip
            type: 'shadow' // 'shadow' as default; can also be 'line' or 'shadow'
        }
    },
    legend: {},
    grid: {
        left: '3%',
        right: '4%',
        bottom: '3%',
        containLabel: true
    },
    xAxis: {
        type: 'value'
    },
    yAxis: {
        type: 'category',
        data: ['Basal Ganglia Calcification', 'Fumarase Deficiency', 'Dominant Beta-Thalassemia']
    },
    series: [
        {
            name: 'A2M',
            type: 'bar',
            stack: 'total',
            label: {
                show: true
            },
            emphasis: {
                focus: 'series'
            },
            data: [320, 302, 301]
        },
        {
            name: 'MIR601',
            type: 'bar',
            stack: 'total',
            label: {
                show: true
            },
            emphasis: {
                focus: 'series'
            },
            data: [120, 132, 101]
        },
        {
            name: 'DPY30',
            type: 'bar',
            stack: 'total',
            label: {
                show: true
            },
            emphasis: {
                focus: 'series'
            },
            data: [220, 182, 191]
        },
        {
            name: 'SCN3B',
            type: 'bar',
            stack: 'total',
            label: {
                show: true
            },
            emphasis: {
                focus: 'series'
            },
            data: [150, 212, 201]
        },
        {
            name: 'ABO',
            type: 'bar',
            stack: 'total',
            label: {
                show: true
            },
            emphasis: {
                focus: 'series'
            },
            data: [820, 832, 901]
        }
    ]
};
dieseaseStripeChart.setOption(option3);

var formulaBarChart = echarts.init(document.getElementById('formulaBar'));
let option4 = {
    title: {
        text: '方剂-药理（分子）',
        left: 'center'
    },
    tooltip: {
        trigger: 'item'
    },
    legend: {
        orient: 'vertical',
        left: 'left'
    },
    series: [
        {
            name: 'Access From',
            type: 'pie',
            radius: '50%',
            data: [
                { value: 1048, name: 'A2M' },
                { value: 735, name: 'MIR601' },
                { value: 580, name: 'DPY30' },
                { value: 484, name: 'SCN3B' },
                { value: 1300, name: 'ABO' }
            ],
            emphasis: {
                itemStyle: {
                    shadowBlur: 10,
                    shadowOffsetX: 0,
                    shadowColor: 'rgba(0, 0, 0, 0.5)'
                }
            }
        }
    ]
};
formulaBarChart.setOption(option4);


var formulaStripeChart = echarts.init(document.getElementById('formulaStripe'));
let option5 = {
    tooltip: {
        trigger: 'axis',
        axisPointer: {
            // Use axis to trigger tooltip
            type: 'shadow' // 'shadow' as default; can also be 'line' or 'shadow'
        }
    },
    legend: {},
    grid: {
        left: '3%',
        right: '4%',
        bottom: '3%',
        containLabel: true
    },
    xAxis: {
        type: 'value'
    },
    yAxis: {
        type: 'category',
        data: ['甘草', '升麻', '白芍']
    },
    series: [
        {
            name: 'A2M',
            type: 'bar',
            stack: 'total',
            label: {
                show: true
            },
            emphasis: {
                focus: 'series'
            },
            data: [320, 302, 301]
        },
        {
            name: 'MIR601',
            type: 'bar',
            stack: 'total',
            label: {
                show: true
            },
            emphasis: {
                focus: 'series'
            },
            data: [120, 132, 101]
        },
        {
            name: 'DPY30',
            type: 'bar',
            stack: 'total',
            label: {
                show: true
            },
            emphasis: {
                focus: 'series'
            },
            data: [220, 182, 191]
        },
        {
            name: 'SCN3B',
            type: 'bar',
            stack: 'total',
            label: {
                show: true
            },
            emphasis: {
                focus: 'series'
            },
            data: [150, 212, 201]
        },
        {
            name: 'ABO',
            type: 'bar',
            stack: 'total',
            label: {
                show: true
            },
            emphasis: {
                focus: 'series'
            },
            data: [820, 832, 901]
        }
    ]
};
formulaStripeChart.setOption(option5);