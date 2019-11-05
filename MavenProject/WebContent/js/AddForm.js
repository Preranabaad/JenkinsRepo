function validateUser(){
   
    var firstname = document.getElementById("firstname").value;
    var lastname = document.getElementById("lastname").value;
   
    if(firstname == ""){
        alert("firstname can not be blank.");
        return false;
    }else if(lastname == ""){
        alert("lastname can not be blank.");
        return false;
    }else{
        var form = document.getElementById("frm");
        form.action = "add.do";
        form.submit();
    }
}

function deleteUser(){
	var id = document.getElementById("id").value;
	if(id == ""){
        alert("id can not be blank.");
        return false;
    }else{
        var form = document.getElementById("frm");
        form.action = "delete.do";
        form.submit();
    }
}
