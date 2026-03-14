package com.metrolist.innertube.models

import kotlinx.serialization.Serializable

@Serializable
data class ItemSectionRenderer(
    val contents: List<Content> = emptyList(),
) {
    @Serializable
    data class Content(
        val musicShelfRenderer: MusicShelfRenderer? = null,
    )
}
