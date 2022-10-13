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

var myChart = echarts.init(document.getElementById('relation'));
myChart.showLoading();
myChart.hideLoading();
graph.nodes.forEach(function (node) {
    node.label = {
        show: node.symbolSize > 30
    };
});
let option = {
    title: {
        text: '',
        subtext: '',
        // top: 'bottom',
        // left: 'right'
    },
    tooltip: {},
    legend: [
        {
            // selectedMode: 'single',
            data: graph.categories.map(function (a) {
                return a.name;
            })
        }
    ],
    animationDuration: 1500,
    animationEasingUpdate: 'quinticInOut',
    series: [
        {
            name: '靶点预测',
            type: 'graph',
            layout: 'none',
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
            },
            emphasis: {
                focus: 'adjacency',
                lineStyle: {
                    width: 10
                }
            }
        }
    ]
};
myChart.setOption(option);