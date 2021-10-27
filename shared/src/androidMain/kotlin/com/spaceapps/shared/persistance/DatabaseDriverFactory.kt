package com.spaceapps.shared.persistance

import android.content.Context
import com.spaceapps.shared.DATABASE_NAME
import com.squareup.sqldelight.android.AndroidSqliteDriver
import com.squareup.sqldelight.db.SqlDriver

actual class DatabaseDriverFactory(private val context: Context) {
    actual fun createDriver(): SqlDriver {
        return AndroidSqliteDriver(Database.Schema, context, DATABASE_NAME)
    }
}