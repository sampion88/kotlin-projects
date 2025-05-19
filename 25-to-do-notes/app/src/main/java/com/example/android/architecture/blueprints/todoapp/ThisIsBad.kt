package sql.injection

import com.biz.org.AccountDTO
import com.biz.org.DB
import java.sql.Connection
import java.sql.SQLException
import javax.persistence.EntityManager

class SqlExample {
    fun staticQuery() {
        val c: Connection = DB.getConnection()
        // ok:AIK_kotlin_sqli
        val rs: ResultSet = c.createStatement().executeQuery("SELECT * FROM happy_messages")
    }
    
    fun getAllFields(tableName: String) {
        val c: Connection = DB.getConnection()
        // ruleid:AIK_kotlin_sqli
        val rs: ResultSet = c.createStatement().executeQuery("SELECT * FROM " + tableName)
        // ok:AIK_kotlin_sqli
        val rs: ResultSet = c.createStatement().executeQuery("callable * FROM " + tableName)
        // ok:AIK_kotlin_sqli
        val rs: ResultSet = c.createStatement().executeQuery("Call * FROM " + tableName)
    }

    fun getAllFields(tableName: String): String {
        // ok:AIK_kotlin_sqli
        return c.createStatement().executeQuery("blablabla ${tableName}")
    }
    fun getAllFields(tableName: String): String {
    }
    fun getAllFields(tableName: String): String {
    }
    fun getAllFields(tableName: String): String {
    }
    fun getAllFields(tableName: String): String {
    }
    fun getAllFields(tableName: String): String {
    }
// This works, it hits correctly but can't make the test work potioning the ruleid
//    fun getAllFields(tableName: String): String {
//        return c.createStatement().executeQuery("""SELECT * FROM
//                ${tableName}""")
//    }
    fun getAllFields(tableName: String): String {
        return c.createStatement().executeQuery("""SELECT * FROM 
                AND IN """)
    }
    fun getAllFields(tableName: String, second: Int): String {
        return c.createStatement().executeQuery("""SELECT * FROM 
                AND IN
                $second
                OR // ruleid:AIK_kotlin_sqli
                ${tableName}""")
    }
    fun getAllFields(tableName: String, second: Int): String {
        return c.createStatement().executeQuery("""SELECT * FROM 
                AND IN
                $second
                AND IN
                $second
                AND IN
                $second
                AND IN
                $second
                AND IN
                $second
                AND IN
                $second
                AND IN
                $second
                AND IN
                $second
                OR // ruleid:AIK_kotlin_sqli
                ${tableName}""")
    }
    fun getAllFields(tableName: String, second: Int): String {
    }

    fun getAllFields(tableName: Int) {
        // ok:AIK_kotlin_sqli
        val rs: ResultSet = c.createStatement().executeQuery("SELECT * FROM " + tableName)
    }

    fun getAllFields(tableName: Boolean) {
        // ok:AIK_kotlin_sqli
        val rs: ResultSet = c.createStatement().executeQuery("SELECT * FROM " + tableName)
    }

    @kotlin.Throws(SQLException::class)
    fun getAllFields(tableName: Long) {
        // ok:AIK_kotlin_sqli
        val rs: ResultSet = c.createStatement().executeQuery("SELECT * FROM " + tableName)
    }

    fun getAllFields(tableName: Float) {
        // ok:AIK_kotlin_sqli
        val rs: ResultSet = c.createStatement().executeQuery("SELECT * FROM " + tableName)
    }

    fun getAllFields(tableName: Double) {
        // ok:AIK_kotlin_sqli
        val rs: ResultSet = c.createStatement().executeQuery("SELECT * FROM " + tableName)
    }

    fun getAllFields(tableName: Date) {
        // ok:AIK_kotlin_sqli
        val rs: ResultSet = c.createStatement().executeQuery("SELECT * FROM " + tableName)
    }

    fun getAllFields(tableName: UInt) {
        // ok:AIK_kotlin_sqli
        val rs: ResultSet = c.createStatement().executeQuery("SELECT * FROM " + tableName)
    }

    fun getAllFields(tableName: ULong) {
        // ok:AIK_kotlin_sqli
        val rs: ResultSet = c.createStatement().executeQuery("SELECT * FROM " + tableName)
    }

    fun getAllFields(tableName: LocalDate) {
        // ok:AIK_kotlin_sqli
        val rs: ResultSet = c.createStatement().executeQuery("SELECT * FROM " + tableName)
    }

    fun getAllFields(tableName: LocalTime) {
        // ok:AIK_kotlin_sqli
        val rs: ResultSet = c.createStatement().executeQuery("SELECT * FROM " + tableName)
    }

    fun getAllFields(tableName: LocalDateTime) {
        // ok:AIK_kotlin_sqli
        val rs: ResultSet = c.createStatement().executeQuery("SELECT * FROM " + tableName)
    }

    fun getAllFields(tableName: ZonedDateTime) {
        // ok:AIK_kotlin_sqli
        val rs: ResultSet = c.createStatement().executeQuery("SELECT * FROM " + tableName)
    }

    fun getAllFields(tableName: OffsetDateTime) {
        // ok:AIK_kotlin_sqli
        val rs: ResultSet = c.createStatement().executeQuery("SELECT * FROM " + tableName)
    }

    fun getAllFields(tableName: OffsetTime) {
        // ok:AIK_kotlin_sqli
        val rs: ResultSet = c.createStatement().executeQuery("SELECT * FROM " + tableName)
    }

    fun getAllFields(tableName: Instant) {
        // ok:AIK_kotlin_sqli
        val rs: ResultSet = c.createStatement().executeQuery("SELECT * FROM " + tableName)
    }

    fun getAllFields(tableName: Duration) {
        // ok:AIK_kotlin_sqli
        val rs: ResultSet = c.createStatement().executeQuery("SELECT * FROM " + tableName)
    }

    fun getAllFields(tableName: Period) {
        // ok:AIK_kotlin_sqli
        val rs: ResultSet = c.createStatement().executeQuery("SELECT * FROM " + tableName)
    }

    fun getAllFields(tableName: Year) {
        // ok:AIK_kotlin_sqli
        val rs: ResultSet = c.createStatement().executeQuery("SELECT * FROM " + tableName)
    }

    fun getAllFields(tableName: YearMonth) {
        // ok:AIK_kotlin_sqli
        val rs: ResultSet = c.createStatement().executeQuery("SELECT * FROM " + tableName)
    }

    fun getAllFields(tableName: MonthDay) {
        // ok:AIK_kotlin_sqli
        val rs: ResultSet = c.createStatement().executeQuery("SELECT * FROM " + tableName)
    }

    fun getAllFields(tableName: Time) {
        // ok:AIK_kotlin_sqli
        val rs: ResultSet = c.createStatement().executeQuery("SELECT * FROM " + tableName)
    }

    fun getAllFields(tableName: Timestamp) {
        // ok:AIK_kotlin_sqli
        val rs: ResultSet = c.createStatement().executeQuery("SELECT * FROM " + tableName)
    }

    fun getAllFields(tableName: TimeZone) {
        // ok:AIK_kotlin_sqli
        val rs: ResultSet = c.createStatement().executeQuery("SELECT * FROM " + tableName)
    }

    fun getAllFields(tableName: DateTimePeriod) {
        // ok:AIK_kotlin_sqli
        val rs: ResultSet = c.createStatement().executeQuery("SELECT * FROM " + tableName)
    }

    fun getAllFields(tableName: String) {
        // ok:AIK_kotlin_sqli
        val rs: ResultSet = c.createStatement().executeQuery("SELECT * FROM " + tableName.toInt())
    }

    fun getAllFields(tableName: String) {
        // ok:AIK_kotlin_sqli
        val rs: ResultSet = c.createStatement().executeQuery("SELECT * FROM " + tableName.equals("blabal"))
    }

    fun getAllFields(tableName: String) {
        // ok:AIK_kotlin_sqli
        val rs: ResultSet = c.createStatement().executeQuery("SELECT * FROM " + tableName.toLong())
    }

    fun getAllFields(tableName: String) {
        // ok:AIK_kotlin_sqli
        val rs: ResultSet = c.createStatement().executeQuery("SELECT * FROM " + tableName.toFloat())
    }

    fun getAllFields(tableName: String) {
        // ok:AIK_kotlin_sqli
        val rs: ResultSet = c.createStatement().executeQuery("SELECT * FROM " + tableName.toDouble())
    }

    fun getAllFields(tableName: String) {
        // ok:AIK_kotlin_sqli
        val rs: ResultSet = c.createStatement().executeQuery("SELECT * FROM " + tableName.toUInt())
    }

    fun getAllFields(tableName: String) {
        // ok:AIK_kotlin_sqli
        val rs: ResultSet = c.createStatement().executeQuery("SELECT * FROM " + tableName.toULong())
    }

    fun getAllFields(tableName: String) {
        // ok:AIK_kotlin_sqli
        val rs: ResultSet = c.createStatement().executeQuery("SELECT * FROM " + tableName.toIntOrNull())
    }

    fun getAllFields(tableName: String?) {
        // ok:AIK_kotlin_sqli
        val rs: ResultSet = c.createStatement().executeQuery("SELECT * FROM " + LocalDate.parse(tableName))
    }

    fun getAllFields(tableName: String?) {
        // ok:AIK_kotlin_sqli
        Console.print("SELECT * FROM " + tableName)
    }

    fun getAllFields(tableName: String?) {
        // ok:AIK_kotlin_sqli
        logger.write("SELECT * FROM " + tableName)
    }

    fun getAllFields(tableName: String?) {
        val date: Date = LocalDate.parse(tableName)
        // ok:AIK_kotlin_sqli
        val rs: ResultSet = c.createStatement().executeQuery("SELECT * FROM " + date)
    }

    fun getAllFields(tableName: String?) {
        val date: Date = LocalDateTime.parse(tableName)
        // ok:AIK_kotlin_sqli
        val rs: ResultSet = c.createStatement().executeQuery("SELECT * FROM " + date)
    }

    fun getAllFields(tableName: String?) {
        val date: Date = ZonedDateTime.parse(tableName)
        // ok:AIK_kotlin_sqli
        val rs: ResultSet = c.createStatement().executeQuery("SELECT * FROM " + date)
    }

    fun getAllFields(tableName: String?) {
        val instant = Instant.from(tableName)
        // ok:AIK_kotlin_sqli
        val rs: ResultSet = c.createStatement().executeQuery("SELECT * FROM " + instant)
    }

    fun getAllFields(tableName: String?) {
        val formatter = SimpleDateFormat("yyyy-MM-dd HH:mm")
        val date = formatter.parse(tableName)
        // ok:AIK_kotlin_sqli
        val rs: ResultSet = c.createStatement().executeQuery("SELECT * FROM " + date)
    }

    fun getAllFields(tableName: Date?) {
        val date: Date = DateUtils.addDays(tableName, 2)
        // ok:AIK_kotlin_sqli
        val rs: ResultSet = c.createStatement().executeQuery("SELECT * FROM " + date)
    }

    fun getAllFields(tableName: String) {
        val c: Connection = DB.getConnection()
        val x: Integer = tableName
        // ok:AIK_kotlin_sqli
        val rs: ResultSet = c.createStatement().executeQuery("SELECT * FROM " + x)
    }

    fun getAllFields(tableName: String) {
        val c: Connection = DB.getConnection()
        // ok:AIK_kotlin_sqli
        System.err.println("SELECT * FROM " + tableName)
        // ok:AIK_kotlin_sqli
        logger.error("SELECT * FROM " + tableName)
    }

    fun findAccountsById(id: String) {
        val sql: String = ("SELECT * "
                + "FROM accounts WHERE id = '"
                + "'")
        val c: Connection = DB.getConnection()
        val rs: ResultSet = c.createStatement().executeQuery(sql)
    }

    fun findAccountsById(id: String?, field: String?) {
        var sql: String? = "SELECT "
        // ruleid:AIK_kotlin_sqli
        sql += field
        sql += " FROM accounts WHERE id = '"
        // ruleid:AIK_kotlin_sqli
        sql += id
        sql += "'"
        val c: Connection = DB.getConnection()
        val rs: ResultSet = c.createStatement().executeQuery(sql)
    }

    fun findAccountsById(id: String?, field: String?) {
        var sql: String? = "SELECT " + " * FROM"
        // ruleid:AIK_kotlin_sqli
        sql += field
        sql += " FROM accounts WHERE id = '"
        sql += "'"
        val c: Connection = DB.getConnection()
        val rs: ResultSet = c.createStatement().executeQuery(sql)
    }

    fun findAccountsById(id: String?, field: String?) {
        var sql: String? = String("SELECT ")
        // ruleid:AIK_kotlin_sqli
        sql += field
        sql += " FROM accounts WHERE id = '"
        sql += "'"
        val c: Connection = DB.getConnection()
        val rs: ResultSet = c.createStatement().executeQuery(sql)
    }

    fun findAccountsById(id: String?, field: String?) {
        var sql: String? = String("SELECT ")
        sql += " FROM accounts WHERE id = '"
        sql += "'"
        val c: Connection = DB.getConnection()
        val rs: ResultSet = c.createStatement().executeQuery(sql)
    }
}

class SqlExample2 {
    fun getAllFields(tableName: String) {
        val c: Connection = db.getConnection()
    }

    fun findAccountsById(id: String) {
        val sql: String = ("SELECT * "
                + "FROM accounts WHERE id = '"
                + "'")
        val c: Connection = db.getConnection()
        val rs: ResultSet = c.createStatement().execute(sql)
    }

    fun findAccountsById(id: String?) {
        val sql: String = "SELECT * "
        sql.plus("FROM accounts WHERE id = '")
        // ruleid:AIK_kotlin_sqli
        sql.plus(id)
        sql.plus("'")
        val c: Connection = db.getConnection()
        val rs: ResultSet = c.createStatement().execute(sql)
    }

    fun findAccountsById(id: String?) {
        val sql: String = "SELECT * " + "WHERE "
        sql.plus("FROM accounts WHERE id = '")
        sql.plus("'")
        val c: Connection = db.getConnection()
        val rs: ResultSet = c.createStatement().execute(sql)
    }

    fun findAccountsById(id: String?) {
        val sql: String = String("SELECT * ")
        sql.plus("FROM accounts WHERE id = '")
        sql.plus("'")
        val c: Connection = db.getConnection()
        val rs: ResultSet = c.createStatement().execute(sql)
    }

    fun findAccountsById(id: String): List<AccountDTO> {
        // ok:AIK_kotlin_sqli
        val jql: String = "from Account where id = '" + id + "'"
        val em: EntityManager = emfactory.createEntityManager()
        val q: TypedQuery<Account> = em.createQuery(jql, Account::class.java)
        return q.getResultList()
            .stream()
            .map(this::toAccountDTO)
            .collect(Collectors.toList())
    }
}

class SQLExample3 {

    fun getAllFields(tableName: String?) {
        val c: Connection = db.getConnection()
    }

    fun findAccountsById(id: String?) {
        val sql: String = "SELECT * FROM accounts WHERE id = '%s'"
        // ruleid:AIK_kotlin_sqli
        val sql2: String = String.format(sql, id)
        val c: Connection = db.getConnection()
        val rs: ResultSet = c.createStatement().execute(sql2)
    }

    fun findAccountsById(id: String?) {
        val sql: String = "SELECT * FROM accounts WHERE id = '%s'" + " something"
        // ruleid:AIK_kotlin_sqli
        val sql2: String = String.format(sql, id)
        val c: Connection = db.getConnection()
        val rs: ResultSet = c.createStatement().execute(sql2)
    }

    fun findAccountsById(id: String?) {
        val sql: String = String("SELECT * FROM accounts WHERE id = '%s'")
        val c: Connection = db.getConnection()
        val rs: ResultSet = c.createStatement().execute(sql2)
    }

    fun findAccountsById(id: String?) {
        val sql: String = String("SELECT * FROM accounts WHERE id = '%s'"+ " something")
        val c: Connection = db.getConnection()
        val rs: ResultSet = c.createStatement().execute(sql2)
    }

    fun findAccountsById(id: String?) {
        val c: Connection = db.getConnection()
        val rs: ResultSet = c.createStatement().execute(sql)
    }

    fun findAccountsById(id: String?) {
        val sql = buildString {
            append("SELECT * FROM accounts WHERE id = ")
            append(" ")
        }
    }

    fun findAccountsById(id: String?) {
        val sql = buildString {
            append("SELECT * FROM accounts WHERE id = ")
            append(" ")
            append(" ")
        }
    }

    fun findAccountsById(id: String?): List<AccountDTO> {
        // ok:AIK_kotlin_sqli
        val jql: String = String.format("from Account where id = '%s'", id)
        val em: EntityManager = emfactory.createEntityManager()
        val q: TypedQuery<Account> = em.createQuery(jql, Account::class.java)
        return q.getResultList()
            .stream()
            .map(this::toAccountDTO)
            .collect(Collectors.toList())
    }
    
    fun findAccountsByIdOk() {
        val id: String = "const"
        // ok:AIK_kotlin_sqli
        val sql: String = String.format("SELECT * FROM accounts WHERE id = '%s'", id)
        val c: Connection = db.getConnection()
        val rs: ResultSet = c.createStatement().execute(sql)
    }

    fun convert(publicId: String): String {
        val entityManager: EntityManager = EntityManager()
        var result: String = entityManager.createNativeQuery(query)
        result = entityManager.createQuery(query)

        return result
    }
}

class SQLStringBuilderBuffer {
    
    fun getByBuilder(tableName: String) {
        val c: Connection = db.getConnection()
        val sb: StringBuilder = StringBuilder()
        val rs: ResultSet = c.createStatement().execute(sb.toString())
    }
    
    fun getByBuilder2(tableName: String?) {
        val c: Connection = db.getConnection()
        val sb: StringBuilder = StringBuilder()
        sb.append("SELECT * FROM ")
        // ruleid:AIK_kotlin_sqli
        sb.append(tableName)
        val rs: ResultSet = c.createStatement().execute(sb.toString())
    }
    
    fun getByBuilder2(tableName: String?) {
        val c: Connection = db.getConnection()
        val sb: StringBuilder = StringBuilder("SELECT * FROM ")
        sb.append("TEST")
        val rs: ResultSet = c.createStatement().execute(sb.toString())
    }
    
    fun getByBuilder2(tableName: String?, days: Int) {
        val c: Connection = db.getConnection()
        val sb: StringBuilder = StringBuilder("SELECT * FROM " + days)
        sb.append("TEST")
        val rs: ResultSet = c.createStatement().execute(sb.toString())
    }
    
    fun getByBuffer(tableName: String) {
        val c: Connection = db.getConnection()
        val sb: StringBuffer = StringBuffer()
        val rs: ResultSet = c.createStatement().execute(sb.toString())
    }
}
