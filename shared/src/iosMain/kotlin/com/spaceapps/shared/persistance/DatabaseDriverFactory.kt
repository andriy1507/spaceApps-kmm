package com.spaceapps.shared.persistance

import com.spaceapps.shared.DATABASE_NAME
import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.drivers.native.NativeSqliteDriver

actual class DatabaseDriverFactory {
    actual fun createDriver(): SqlDriver {
        return NativeSqliteDriver(Database.Schema, DATABASE_NAME)
    }
}