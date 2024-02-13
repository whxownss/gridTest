<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Toast UI Grid -->
<link rel="stylesheet" href="https://uicdn.toast.com/grid/latest/tui-grid.css" />
<script src="https://uicdn.toast.com/grid/latest/tui-grid.js"></script>
</head>
<body>

<div id="grid"></div>




<script>
var data = [];	
for (let i = 0; i < 10; i++) {
    data.push({
    	name: 'Beautiful Lies',
        artist: 'Birdy',
        release: '2016.03.26',
        genre: i
    });
};

const Grid = tui.Grid;
const instance = new Grid({
	  el: document.getElementById('grid'), // Container element
	  columns: [
	    {
	      header: 'Name',
	      name: 'name'
	    },
	    {
	      header: 'Artist',
	      name: 'artist',
	      editor: 'text'
	    },
	    {
	      header: 'Release',
	      name: 'release'
	    },
	    {
	      header: 'Genre',
	      name: 'genre'
	    }
	  ],
	  data: data
	});

	instance.resetData(newData); // Call API of instance's public method

	Grid.applyTheme('striped'); // Call API of static method
</script>
</body>
</html>