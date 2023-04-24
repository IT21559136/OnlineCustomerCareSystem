var nameError = document.getElementById('name-error');
var pwdError = document.getElementById('psw-error');

function validateName(){
    var cmail = document.getElementById('check-name').value;
    if(cmail.length == 0){
        nameError.innerHTML = 'Enter a valid Name';
        document.getElementById('name-error').style.color = 'red';
        document.getElementById('check-name').style.borderColor = "red";
       
    }else{
        nameError.innerHTML = 'Valid';
        document.getElementById('name-error').style.color = '#1FEF25';
        document.getElementById('check-name').style.borderColor = "#1FEF25";
    }  
    
    
}

function validatePwd(){
    var cpwd = document.getElementById('signInPassword').value;
    if(cpwd.length <= 3){ 
        pwdError.innerHTML = 'Your Password must be contain 4 characters';
        document.getElementById('psw-error').style.color = 'red';
        document.getElementById('signInPassword').style.borderColor = "red";
       
    }else{
        pwdError.innerHTML = 'Valid';
        document.getElementById('psw-error').style.color = '#1FEF25';
        document.getElementById('signInPassword').style.borderColor = "#1FEF25";
    } 
    
    
}

function validateMail() {
    var cmail = document.getElementById('signInEmail').value;
    if (cmail.length == 0) {
        mailError.innerHTML = 'Enter E-mail';
        document.getElementById('mail-error').style.color = 'red';
        document.getElementById('signInEmail').style.borderColor = "red";

    } else {
        mailError.innerHTML = 'Valid';
        document.getElementById('mail-error').style.color = '#1FEF25';
        document.getElementById('signInEmail').style.borderColor = "#1FEF25";
    }
}