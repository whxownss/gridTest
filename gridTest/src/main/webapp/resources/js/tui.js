$(() => {
	
var grid = function(url, perPage){
	
	const dataSource = {
		api: {
			readData: { url: url, method: 'GET' }
		}
	};
	
	const Grid = tui.Grid;
	const grid = new Grid({
		el: document.getElementById('grid'),
		columns: [
			{name:"LO_IDX", 	 header:"지역 번호"}, 
			{name:"CI_IDX", 	 header:"영화관 번호"},
			{name:"CI_NAME", 	 header:"영화관 이름"},
			{name:"CI_ADDR",	 header:"영화관 주소"},
			{name:"CI_OC",		 header:"오픈 여부"},
			{name:"CI_S_NUM",	 header:"상영관 갯수"},
			{name:"CREATE_USER", header:"사용자"},
			{name:"CREATE_DATE", header:"사용 시간"}
		],
		data: dataSource,
		rowHeaders: ['rowNum'],
		pageOptions: {
        	useClient: true,
        	perPage: perPage
		}
	});
	
}	

grid("test/cinema", 10);
	
	
})