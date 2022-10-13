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
    data: function (){
        return {
            drug:'',
            amount: 1,
            amountType: 'g',
            form: {
                name: '',
                source: '',
                type: '',
                remark: ''
            },
            tableDrug: [{
                name: '桃仁',
                amount: '50个'
            }, {
                name: '大黄',
                amount: '200g'
            }, {
                name: '桂枝',
                amount: '100g'
            }, {
                name: '甘草',
                amount: '100g'
            }],
            drugOptions: [{
                value: '1',
                label: '桃仁'
            }, {
                value: '2',
                label: '大黄'
            }, {
                value: '3',
                label: '桂枝'
            }, {
                value: '4',
                label: '甘草'
            }],
            amountOptions:[{
                value: '1',
                label: 'g'
            }, {
                value: '2',
                label: '个'
            }, {
                value: '3',
                label: '两'
            }]
        }
    },
    methods: {
        onSubmit() {
            console.log('submit!');
        },
        add(){
            var newamount = vm.amount + vm.amountType;
            vm.tableDrug.push({name:vm.drug, amount: newamount});
        },
        save(){

        },
        remove(){
            vm.tableDrug = vm.tableDrug.slice(0,-1);
        }
    }
})