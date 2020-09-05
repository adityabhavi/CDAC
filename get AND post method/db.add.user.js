const Promise = require("bluebird");
const mysql = require("mysql");

Promise.promisifyAll(require("mysql/lib/Connection").prototype);
Promise.promisifyAll(require("mysql/lib/Pool").prototype);

const DB_CONFIG = {
    host: "127.0.0.1",
    user: "root",
    password: "7775014945",
    database: "project",
};

let addUser = async(input) => {
    const connection = mysql.createConnection(DB_CONFIG);
    await connection.connectAsync();

    let sql =
        "INSERT INTO emp2 (fname,lname) VALUES (?, ?)";
    await connection.queryAsync(sql, [
        input.fname,
        input.lname,
    ]);

    await connection.endAsync();
};

let authenticateUser = async(input) => {
    const connection = mysql.createConnection(DB_CONFIG);
    await connection.connectAsync();

    let sql = "SELECT * FROM USER WHERE USERNAME=? AND PASSWORD=?";
    const results = await connection.queryAsync(sql, [
        input.username,
        input.password,
    ]);

    await connection.endAsync();

    if (results.length === 0) {
        throw new Error("Invalid Credentials");
    }
};

module.exports = { addUser, authenticateUser };