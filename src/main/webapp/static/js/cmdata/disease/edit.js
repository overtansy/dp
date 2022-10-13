/**
 * 编辑-js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		cmDisease: {
			diseaseId: 0
		}
	},
	methods : {
		setForm: function() {
			$.SetForm({
				url: '../../cmdata/disease/info?_' + $.now(),
		    	param: vm.cmDisease.diseaseId,
		    	success: function(data) {
		    		vm.cmDisease = data;
		    	}
			});
		},
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.ConfirmForm({
		    	url: '../../cmdata/disease/update?_' + $.now(),
		    	param: vm.cmDisease,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})