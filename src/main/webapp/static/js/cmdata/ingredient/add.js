/**
 * 新增-js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		cmIngredient: {
			ingredientId: 0
		}
	},
	methods : {
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.SaveForm({
		    	url: '../../cmdata/ingredient/save?_' + $.now(),
		    	param: vm.cmIngredient,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})
