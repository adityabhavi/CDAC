let mysql=require("mysql");
let Promise=require("bluebird");

Promise.promisifyAll(require("mysql/lib/Connection").prototype);
Promise.promisifyAll(require("mysql/lib/Pool").prototype);

let readallbook=async()=>{
    const connection = mysql.createConnection({
        host:"127.0.0.1",
        user:"root",
        password:"7775014945",
        database:"abc",
    })
    await connection.connectAsync();

    let sql="select * from book";

    let result = await connection.queryAsync(sql);

    console.log(result);
    
    await connection.endAsync();
    return result;
}
readallbook();