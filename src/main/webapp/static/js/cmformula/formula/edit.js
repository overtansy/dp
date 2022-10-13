/**
 * 编辑-js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		cmFormula: {
			formulaId: 0
		}
	},
	methods : {
		setForm: function() {
			$.SetForm({
				url: '../../cmformula/formula/info?_' + $.now(),
		    	param: vm.cmFormula.formulaId,
		    	success: function(data) {
		    		vm.cmFormula = data;
		    	}
			});
		},
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.ConfirmForm({
		    	url: '../../cmformula/formula/update?_' + $.now(),
		    	param: vm.cmFormula,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})