function AjaxJson() {
    let xhr = new XMLHttpRequest();

    xhr.open("GET", "https://reqres.in/api/users?page=2");

    xhr.onload = () => {
        const refJson = JSON.parse(xhr.responseText);

        DOMforJson(refJson);
    }

    xhr.send();
}

function DOMforJson(refJson) {
    let parent = document.getElementById("parent");

    for (let i = 0; i < refJson.data.length; i++) {
        let item = refJson.data[i];

        let newElement = parent.children[0].cloneNode(true);
        newElement.innerHTML = item.first_name + " " + item.last_name;
        parent.insertBefore(newElement, parent.firstChild);
    }
}

function AjaxXML() {

    let xhr = new XMLHttpRequest();

    xhr.open("GET","https://fakerestapi.azurewebsites.net/api/Authors");

    xhr.setRequestHeader("accept","application/xml");

    xhr.onload = () => {
        const xmlDoc = xhr.responseXML;

        DOMforXML(xmlDoc);
    };

    xhr.send(); 
}

function DOMforXML(xmlDoc){
    let parentElement = xmlDoc.querySelector("ArrayOfAuthor");

    for(let i=0; i < parentElement.children.length ; i++){
        let item = parentElement.children[i];

        
    let firstName = item.children[0].innerHTML;
    let lastName = item.children[3].innerHTML;

    // HTML DOM
    let parent = document.querySelector("#parent");
    let newElement = parent.children[0].cloneNode(true);

    newElement.innerHTML = firstName + " " + lastName;

    parent.insertBefore(newElement, parent.firstChild);

    }
}