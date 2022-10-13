/**
 * 新增-js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		cmFormula: {
			formulaId: 0
		}
	},
	methods : {
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.SaveForm({
		    	url: '../../cmformula/formula/save?_' + $.now(),
		    	param: vm.cmFormula,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})
