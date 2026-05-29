package com.dshatz.tbreport.parse

import kotlinx.serialization.modules.SerializersModule
import nl.adaptivity.xmlutil.QName
import nl.adaptivity.xmlutil.XmlDeclMode
import nl.adaptivity.xmlutil.XmlReader
import nl.adaptivity.xmlutil.serialization.InputKind
import nl.adaptivity.xmlutil.serialization.UnknownChildHandler
import nl.adaptivity.xmlutil.serialization.XML
import nl.adaptivity.xmlutil.serialization.structure.XmlDescriptor

private val serialModule = SerializersModule {  }

val xml = XML.v1(serialModule) {
    xmlDeclMode = XmlDeclMode.None
    policy {
        ignoreUnknownChildren()
        ignoreNamespaces()
        unknownChildHandler = object: UnknownChildHandler {
            override fun handleUnknownChildRecovering(
                input: XmlReader,
                inputKind: InputKind,
                descriptor: XmlDescriptor,
                name: QName?,
                candidates: Collection<Any>
            ): List<XML.ParsedData<*>> {
                return emptyList()
            }

        }
    }
}