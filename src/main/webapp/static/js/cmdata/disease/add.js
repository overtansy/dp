/**
 * 新增-js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		cmDisease: {
			diseaseId: 0
		}
	},
	methods : {
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.SaveForm({
		    	url: '../../cmdata/disease/save?_' + $.now(),
		    	param: vm.cmDisease,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})
