/**
 * js
 */

$(function () {
	initialPage();
	getGrid();
});

function initialPage() {
	$(window).resize(function() {
		$('#dataGrid').bootstrapTable('resetView', {height: $(window).height()-56});
	});
}

function getGrid() {
	$('#dataGrid').bootstrapTableEx({
		url: '../../cmdata/disease/list?_' + $.now(),
		height: $(window).height()-56,
		queryParams: function(params){
			params.name = vm.keyword;
			return params;
		},
		columns: [
			{checkbox: true},
            {field : "diseaseId", title : "", width : "100px"},
            {field : "diseaseName", title : "疾病名", width : "100px"},
            {field : "diseaseDefinition", title : "疾病定义", width : "100px"},
            {field : "umlsId", title : "umlsId", width : "100px"},
            {field : "meshId", title : "meshId", width : "100px"},
            {field : "omimId", title : "omimId", width : "100px"},
            {field : "orphanetId", title : "orphanetId", width : "100px"},
            {field : "icd10cmId", title : "icd10cmId", width : "100px"},
            {field : "meddraId", title : "meddraId", width : "100px"},
            {field : "linkDiseaseId", title : "关联疾病id", width : "100px"},
            {title : "操作", formatter : function(value, row, index) {
                    var _html = '';
                    if (hasPermission('cmdata:disease:edit')) {
                        _html += '<a href="javascript:;" onclick="vm.edit(\''+row.diseaseId+'\')" title="编辑"><i class="fa fa-pencil"></i></a>';
                    }
                    if (hasPermission('cmdata:disease:remove')) {
                        _html += '<a href="javascript:;" onclick="vm.remove(false,\''+row.diseaseId+'\')" title="删除"><i class="fa fa-trash-o"></i></a>';
                    }
                    return _html;
                }
            }
		]
	})
}

var vm = new Vue({
	el:'#dpLTE',
	data: {
		keyword: null
	},
	methods : {
		load: function() {
			$('#dataGrid').bootstrapTable('refresh');
		},
		save: function() {
			dialogOpen({
				title: '新增',
				url: 'cmdata/disease/add.html?_' + $.now(),
				width: '420px',
				height: '350px',
				yes : function(iframeId) {
					top.frames[iframeId].vm.acceptClick();
				},
			});
		},
		edit: function(diseaseId) {
            dialogOpen({
                title: '编辑',
                url: 'cmdata/disease/edit.html?_' + $.now(),
                width: '420px',
                height: '350px',
                success: function(iframeId){
                    top.frames[iframeId].vm.cmDisease.diseaseId = diseaseId;
                    top.frames[iframeId].vm.setForm();
                },
                yes: function(iframeId){
                    top.frames[iframeId].vm.acceptClick();
                }
            });
        },
        remove: function(batch, diseaseId) {
            var ids = [];
            if (batch) {
                var ck = $('#dataGrid').bootstrapTable('getSelections');
                if (!checkedArray(ck)) {
                    return false;
                }
                $.each(ck, function(idx, item){
                    ids[idx] = item.diseaseId;
                });
            } else {
                ids.push(diseaseId);
            }
            $.RemoveForm({
                url: '../../cmdata/disease/remove?_' + $.now(),
                param: ids,
                success: function(data) {
                    vm.load();
                }
            });
        }
	}
})