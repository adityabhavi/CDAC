

let AjaxJson = function () {
    let xhr = new XMLHttpRequest();

    xhr.open("GET", "https://reqres.in/api/users?page=2");

    xhr.onload = () => {
        const ref = JSON.parse(xhr.responseText);

        DOMforAjax(ref);
    }

    xhr.send();

}

function DOMforAjax(ref) {
    console.log(ref);

    let parent = document.getElementById("parent");

    for (let i = 0; i < ref.data.length; i++) {
        const item = ref.data[i];

        let newElement = parent.children[0].cloneNode(true);
        newElement.innerHTML = item.first_name + " " + item.last_name;
        parent.insertBefore(newElement, parent.firstChild);

    }
}