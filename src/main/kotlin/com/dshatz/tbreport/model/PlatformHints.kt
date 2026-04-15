package com.dshatz.tbreport.model

import com.dshatz.tbreport.util.matchesGlobPattern


typealias PlatformHints = Map<String, String>

fun PlatformHints.getPlatform(path: String): String? {
    return entries.firstOrNull { (glob, platform) ->
        matchesGlobPattern(glob, path)
    }?.value

}