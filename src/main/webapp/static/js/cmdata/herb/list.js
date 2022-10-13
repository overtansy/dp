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
		url: '../../cmdata/herb/list?_' + $.now(),
		height: $(window).height()-56,
		queryParams: function(params){
			params.name = vm.keyword;
			return params;
		},
		columns: [
			{checkbox: true},
            {field : "chineseName", title : "中文名", width : "100px"},
            {field : "pinyinName", title : "拼音名", width : "100px"},
            {field : "latinName", title : "拉丁名", width : "100px"},
            {field : "englishName", title : "英文名", width : "100px"},
            {field : "alias", title : "别名", width : "100px"},
            {field : "usepart", title : "药用部位", width : "100px"},
            {field : "source", title : "来源", width : "100px"},
            {field : "type", title : "类型", width : "100px"},
            {field : "function", title : "功效", width : "100px"},
            {field : "symptom", title : "主治症状", width : "100px"},
            {field : "syndrome", title : "主治病证", width : "100px"},
            {field : "properties", title : "性味", width : "100px"},
            {field : "meridians", title : "归经", width : "100px"},
            {field : "pharmacology", title : "药理作用", width : "100px"},
            {field : "toxic", title : "毒性", width : "100px"},
            {field : "useMethod", title : "用法", width : "100px"},
            {field : "useAmount", title : "用量", width : "100px"},
            {field : "tcmidId", title : "tcmidId", width : "100px"},
            {field : "tcmIdId", title : "tcmIdId", width : "100px"},
            {field : "tcmspId", title : "tcmspId", width : "100px"},
            {field : "linkHerbId", title : "linkHerbId", width : "100px"},
            {field : "herbdbId", title : "herbdbId", width : "100px"},
            {title : "操作", formatter : function(value, row, index) {
                    var _html = '';
                    if (hasPermission('cmdata:herb:edit')) {
                        _html += '<a href="javascript:;" onclick="vm.edit(\''+row.herbId+'\')" title="编辑"><i class="fa fa-pencil"></i></a>';
                    }
                    if (hasPermission('cmdata:herb:remove')) {
                        _html += '<a href="javascript:;" onclick="vm.remove(false,\''+row.herbId+'\')" title="删除"><i class="fa fa-trash-o"></i></a>';
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
        relation: function() {
            dialogOpen({
                title: '新增',
                url: 'cmdata/herb/relation.html?_' + $.now(),
                width: '1080px',
                height: '600px',
                yes : function(iframeId) {
                    top.frames[iframeId].vm.acceptClick();
                },
            });
        },
		save: function() {
			dialogOpen({
				title: '新增',
				url: 'cmdata/herb/add.html?_' + $.now(),
				width: '420px',
				height: '350px',
				yes : function(iframeId) {
					top.frames[iframeId].vm.acceptClick();
				},
			});
		},
		edit: function(herbId) {
            dialogOpen({
                title: '编辑',
                url: 'cmdata/herb/edit.html?_' + $.now(),
                width: '420px',
                height: '350px',
                success: function(iframeId){
                    top.frames[iframeId].vm.cmHerb.herbId = herbId;
                    top.frames[iframeId].vm.setForm();
                },
                yes: function(iframeId){
                    top.frames[iframeId].vm.acceptClick();
                }
            });
        },
        remove: function(batch, herbId) {
            var ids = [];
            if (batch) {
                var ck = $('#dataGrid').bootstrapTable('getSelections');
                if (!checkedArray(ck)) {
                    return false;
                }
                $.each(ck, function(idx, item){
                    ids[idx] = item.herbId;
                });
            } else {
                ids.push(herbId);
            }
            $.RemoveForm({
                url: '../../cmdata/herb/remove?_' + $.now(),
                param: ids,
                success: function(data) {
                    vm.load();
                }
            });
        }
	}
})