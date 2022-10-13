/**
 * 新增-js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		cmHerb: {
			herbId: 0
		}
	},
	methods : {
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.SaveForm({
		    	url: '../../cmdata/herb/save?_' + $.now(),
		    	param: vm.cmHerb,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})
