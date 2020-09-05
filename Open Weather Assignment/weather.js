let search = () => {
    // CITY NAME IS HARD CODED
  
    let cityName = document.querySelector("#input").value || "pune";
  
    /*let url =
      "https://api.openweathermap.org/data/2.5/weather?appid=7023923dd26a725da995c75b65864de5&units=metric&q=pune";*/
  
    let url =
      "https://api.openweathermap.org/data/2.5/weather?appid=7023923dd26a725da995c75b65864de5&units=metric&q=" +
      cityName;
  
    let xhr = new XMLHttpRequest();
    xhr.open("GET", url);
  
    xhr.onload = () => {
      const refjson = JSON.parse(xhr.responseText);
      console.log(refjson);
      domOperationHere(refjson);
    };
  
    xhr.send();
  };
  
  let domOperationHere = (refjson) => {
 //   console.log(refjson.main);
    const name = refjson.name;
    const maxTemp = refjson.main.temp_max;
    const cloudy1 = refjson.weather[0].main;
    const wind1 = refjson.wind.speed;
    const visibility1 = refjson.visibility;
    const pressure1 = refjson.main.pressure;
    const humidity1 = refjson.main.humidity;
    const feels1 = refjson.main.feels_like;


    const cityname = document.querySelector("#cityname");
    cityname.innerHTML=name;

    const temp = document.querySelector("#temp");
    temp.innerHTML=maxTemp+" c";

    const cloudy = document.querySelector("#cloudy");
    cloudy.innerHTML=cloudy1;

    const wind=document.querySelector("#wind");
    wind.innerHTML="Wind: "+ wind1 +"km/hr";

    const visibility=document.querySelector("#visibility");
    visibility.innerHTML="Visibility: "+ visibility1/1000 +" km";

    const pressure=document.querySelector("#pressure");
    pressure.innerHTML="Pressure: "+pressure1+"mb";

    const humidity=document.querySelector("#humidity");
    humidity.innerHTML="Humidity: "+humidity1+"%"

    const feels=document.querySelector("#feels");
    feels.innerHTML="Feels Like: "+ feels1+"c";
  
    document.querySelector("#textid").value = "";
  };