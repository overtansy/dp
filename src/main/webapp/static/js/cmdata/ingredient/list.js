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
		url: '../../cmdata/ingredient/list?_' + $.now(),
		height: $(window).height()-56,
		queryParams: function(params){
			params.name = vm.keyword;
			return params;
		},
		columns: [
			{checkbox: true},
            {field : "ingredientId", title : "", width : "100px"},
            {field : "moleculeName", title : "分子名", width : "100px"},
            {field : "pubchemCid", title : "pubchemId", width : "100px"},
            {field : "moleculeStructure", title : "分子结构", width : "100px"},
            {field : "moleculeFormula", title : "分子式", width : "100px"},
            {field : "moleculeWeight", title : "分子量", width : "100px"},
            {field : "obScore", title : "ob值", width : "100px"},
            {field : "casId", title : "casId", width : "100px"},
            {field : "tcmidId", title : "tcmidId", width : "100px"},
            {field : "tcmIdId", title : "tcmIdId", width : "100px"},
            {field : "tcmspId", title : "tcmspId", width : "100px"},
            {field : "type", title : "分子类型", width : "100px"},
            {field : "linkIngredientId", title : "关联分子id", width : "100px"},
            {title : "操作", formatter : function(value, row, index) {
                    var _html = '';
                    if (hasPermission('cmdata:ingredient:edit')) {
                        _html += '<a href="javascript:;" onclick="vm.edit(\''+row.ingredientId+'\')" title="编辑"><i class="fa fa-pencil"></i></a>';
                    }
                    if (hasPermission('cmdata:ingredient:remove')) {
                        _html += '<a href="javascript:;" onclick="vm.remove(false,\''+row.ingredientId+'\')" title="删除"><i class="fa fa-trash-o"></i></a>';
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
				url: 'cmdata/ingredient/add.html?_' + $.now(),
				width: '420px',
				height: '350px',
				yes : function(iframeId) {
					top.frames[iframeId].vm.acceptClick();
				},
			});
		},
		edit: function(ingredientId) {
            dialogOpen({
                title: '编辑',
                url: 'cmdata/ingredient/edit.html?_' + $.now(),
                width: '420px',
                height: '350px',
                success: function(iframeId){
                    top.frames[iframeId].vm.cmIngredient.ingredientId = ingredientId;
                    top.frames[iframeId].vm.setForm();
                },
                yes: function(iframeId){
                    top.frames[iframeId].vm.acceptClick();
                }
            });
        },
        remove: function(batch, ingredientId) {
            var ids = [];
            if (batch) {
                var ck = $('#dataGrid').bootstrapTable('getSelections');
                if (!checkedArray(ck)) {
                    return false;
                }
                $.each(ck, function(idx, item){
                    ids[idx] = item.ingredientId;
                });
            } else {
                ids.push(ingredientId);
            }
            $.RemoveForm({
                url: '../../cmdata/ingredient/remove?_' + $.now(),
                param: ids,
                success: function(data) {
                    vm.load();
                }
            });
        }
	}
})