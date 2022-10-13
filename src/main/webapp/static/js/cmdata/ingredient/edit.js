/**
 * 编辑-js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		cmIngredient: {
			ingredientId: 0
		}
	},
	methods : {
		setForm: function() {
			$.SetForm({
				url: '../../cmdata/ingredient/info?_' + $.now(),
		    	param: vm.cmIngredient.ingredientId,
		    	success: function(data) {
		    		vm.cmIngredient = data;
		    	}
			});
		},
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.ConfirmForm({
		    	url: '../../cmdata/ingredient/update?_' + $.now(),
		    	param: vm.cmIngredient,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})