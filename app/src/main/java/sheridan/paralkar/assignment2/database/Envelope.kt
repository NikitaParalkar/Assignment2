package ca.tetervak.kittymessage6.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "gameScore")
data class Envelope(
    @PrimaryKey(autoGenerate = true)
    var id: Long,

    @ColumnInfo(name = "dice1")
    val dice1: Int,

    @ColumnInfo(name = "dice2")
    val dice2: Int,

    @ColumnInfo(name = "dice3")
    val dice3: Int,

    @ColumnInfo(name = "total")
    val textMessage: String,

)