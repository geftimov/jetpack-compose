// Code generated by moshi-kotlin-codegen. Do not edit.
package com.eftimoff.compose.api

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.internal.Util
import java.lang.NullPointerException
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.collections.emptySet
import kotlin.text.buildString

@Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION", "RedundantExplicitType",
    "LocalVariableName")
class StepJsonAdapter(
  moshi: Moshi
) : JsonAdapter<Step>() {
  private val options: JsonReader.Options = JsonReader.Options.of("number", "title")

  private val intAdapter: JsonAdapter<Int> = moshi.adapter(Int::class.java, emptySet(), "number")

  private val stringAdapter: JsonAdapter<String> = moshi.adapter(String::class.java, emptySet(),
      "title")

  override fun toString(): String = buildString(26) {
      append("GeneratedJsonAdapter(").append("Step").append(')') }

  override fun fromJson(reader: JsonReader): Step {
    var number: Int? = null
    var title: String? = null
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> number = intAdapter.fromJson(reader) ?: throw Util.unexpectedNull("number", "number",
            reader)
        1 -> title = stringAdapter.fromJson(reader) ?: throw Util.unexpectedNull("title", "title",
            reader)
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    return Step(
        number = number ?: throw Util.missingProperty("number", "number", reader),
        title = title ?: throw Util.missingProperty("title", "title", reader)
    )
  }

  override fun toJson(writer: JsonWriter, value: Step?) {
    if (value == null) {
      throw NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("number")
    intAdapter.toJson(writer, value.number)
    writer.name("title")
    stringAdapter.toJson(writer, value.title)
    writer.endObject()
  }
}
