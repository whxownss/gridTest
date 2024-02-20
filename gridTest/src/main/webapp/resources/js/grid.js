$(() => {
	debugger;
	var data = [];
	var columns = [];
	
	$.ajax({
		url: "test/cinema",
		type: "GET",
		async: false
	})
	.done(function(e){
		debugger;
		data = e;
		Object.keys(e[0]).forEach((value, index) => {
			columns[index] = {
				header: value,
				name: value
			}
		});
	})
	.fail(function(){
	debugger;})
	
	const Grid = tui.Grid;
	const instance = new Grid({
		  el: document.getElementById('grid'), // Container element
		  columns: columns,
		  data: data,
		  rowHeaders: ['rowNum']
//		  pageOptions: {
//			  useClient: true,	
//			  perPage: 5
//		  }
		});
//	instance.resetData(newData); // Call API of instance's public method
//	Grid.applyTheme('striped'); // Call API of static method
})