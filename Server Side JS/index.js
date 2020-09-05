/*

let signupdata = async () => {
  const fname = document.getElementById("fname").value;
  const lname = document.getElementById("lname").value;
  const email = document.getElementById("email").value;
  const ypass = document.getElementById("ypass").value;
  const cpass = document.getElementById("cpass").value;
  const mobile = document.getElementById("mobile").value;

  if (fname === "" || lname === "" || email === "" || ypass === "" || cpass === "") {
    alert("Please Fill All The Fields...!!!");
    return;
  }

  let url = `http://localhost:3100/adduser?fname=${fname}&lname=${lname}&email=${email}&ypass=${ypass}&cpass=${cpass}`;

  //await fetch(url);

  let xhr = new XMLHttpRequest();
  xhr.open("GET", url);
  xhr.onload = () => {
    const res = xhr.responseText;
    console.log(res);

  };

  xhr.send();

  document.getElementById("fname").value = "";
  document.getElementById("lname").value = "";
  document.getElementById("email").value = "";
  document.getElementById("ypass").value = "";
  document.getElementById("cpass").value = "";
  document.getElementById("mobile").value = "";

}

let registerUsingPost = async () => {
  const fname = document.getElementById("fname").value;
  const lname = document.getElementById("lname").value;
  const email = document.getElementById("email").value;
  const ypass = document.getElementById("ypass").value;
  const cpass = document.getElementById("cpass").value;
  const mobile = document.getElementById("mobile").value;

  const input = {
    fname,
    lname,
    email,
    ypass,
    cpass,
    mobile,
  };
  const url = "http://localhost:3100/adduser";

  // http understands text
  await fetch(url, {
    method: "POST",
    body: JSON.stringify(input),
    headers: {
      "Content-Type": "application/json",
    },


  });

  document.getElementById("fname").value = "";
  document.getElementById("lname").value = "";
  document.getElementById("email").value = "";
  document.getElementById("ypass").value = "";
  document.getElementById("cpass").value = "";
  document.getElementById("mobile").value = "";

  alert("Registration Done Successfully!!!");
}

let signin = async () => {
  const email = document.getElementById("email").value;
  const password = document.getElementById("pasword").value;

  const loginput = {
    email,
    password,
  };

  const url = "http://localhost:3100/adduser";

  // http understands text
  await fetch(url, {
    method: "POST",
    body: JSON.stringify(loginput),
    headers: {
      "Content-Type": "application/json",
    },


  });





}





*/