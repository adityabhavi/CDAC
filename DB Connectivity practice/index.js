const mysql = require("mysql");
const Promise = require("bluebird");

Promise.promisifyAll(require("mysql/lib/Connection").prototype);
Promise.promisifyAll(require("mysql/lib/Pool").prototype);

const con = {
    host: "127.0.0.1",
    user: "root",
    password: "7775014945",
    database: "abc",
};

let readByQuery = async () => {
    const connection = mysql.createConnection(con);
    await connection.connectAsync();
  
    let sql = "select * from book";
    await connection.queryAsync(sql).then((data)=>{
        console.log(data);
    })
  
    connection.end();
//    console.log(results);
    //return results;
  };
  
readByQuery();


