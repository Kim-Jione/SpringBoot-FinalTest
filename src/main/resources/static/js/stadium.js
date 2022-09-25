$("#btnSave").click(() => {
	save();
});


function save() {
	let data = {
		name: $("#name").val(),
	
	};
	console.log(data);
	
	$.ajax("/stadium/save", {
		type: "POST",
		dataType: "json", // 응답 데이터
		data: JSON.stringify(data), // http body에 들고갈 요청 데이터
		headers: { // http header에 들고갈 요청 데이터
			"Content-Type": "application/json"
		}
	}).done((res) => {
		if (res.code == 1) {
			alert(res.msg);
			location.href = "/"; // 현재 접속중인 페이지 정보를 갖고 있다 "/" 로 이동한다는 말이다
		}else {
			alert("경기장 등록이 안됐습니다.");
			history.back();
		}
	});
	
}