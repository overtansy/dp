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
            tableDrug: [{
                id: '1',
                name: '甘草',
                function: '清热祛暑',
                type: '补气药'
            }, {
                id: '2',
                name: '升麻',
                function: '发表清热',
                type: '辛凉解表药'
            }, {
                id: '3',
                name: '白芍',
                function: '养血和营',
                type: '补血药'
            }, {
                id: '4',
                name: '葛根',
                function: '发表清热',
                type: '辛凉解表药'
            }],
            tableTarget: [{
                id: '1',
                target: 'A2M',
                gene: 'Alpha-2-macroglobulin',
                uniprot: 'P01023'
            }, {
                id: '2',
                target: 'ABCB4',
                gene: 'ATP Binding Cassette Subfamily B Member 4',
                uniprot: 'P80404'
            }, {
                id: '3',
                target: 'OSTN',
                gene: 'Osteocrin',
                uniprot: 'P08183'
            }, {
                id: '4',
                target: 'BMIQ7',
                gene: 'Obesity, susceptibility to, on chromosome 4',
                uniprot: 'P45844'
            }]
        }
    },
    methods: {
    }
})