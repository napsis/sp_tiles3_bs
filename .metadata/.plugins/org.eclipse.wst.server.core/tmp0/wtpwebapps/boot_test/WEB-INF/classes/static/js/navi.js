/**
 * navigation manager
 */

function getContextPath() {
			var hostIndex = location.href.indexOf( location.host ) + location.host.length;
			return location.href.substring( hostIndex, location.href.indexOf('/', hostIndex + 1) );
		};

		
var naviManager = {
		init : function(){
			var url = getContextPath() + '/';
			$("#mainFrm").attr("action", url);
			$("#mainFrm").submit();
		}
};