package com.dshatz.tbreport.parse

import kotlinx.datetime.serializers.LocalDateTimeIso8601Serializer
import kotlinx.datetime.serializers.UtcOffsetIso8601Serializer
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlin.time.Instant

class InstantSerializerZ: KSerializer<Instant> {
    override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor( "Instant", PrimitiveKind.STRING)

    private val delegate = LocalDateTimeIso8601Serializer
    private val zoneDelegate = UtcOffsetIso8601Serializer

    override fun serialize(encoder: Encoder, value: Instant) {
        TODO("Not yet implemented")
    }

    override fun deserialize(decoder: Decoder): Instant {
        val str = decoder.decodeString()
        return Instant.parse(str)
    }
}