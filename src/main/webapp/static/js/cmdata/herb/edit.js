/**
 * 编辑-js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		cmHerb: {
			herbId: 0
		}
	},
	methods : {
		setForm: function() {
			$.SetForm({
				url: '../../cmdata/herb/info?_' + $.now(),
		    	param: vm.cmHerb.herbId,
		    	success: function(data) {
		    		vm.cmHerb = data;
		    	}
			});
		},
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.ConfirmForm({
		    	url: '../../cmdata/herb/update?_' + $.now(),
		    	param: vm.cmHerb,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})