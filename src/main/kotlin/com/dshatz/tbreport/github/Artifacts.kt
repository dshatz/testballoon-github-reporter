package com.dshatz.tbreport.github

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ArtifactListResponse(
    @SerialName("total_count") val count: Int,
    val artifacts: List<Artifact>
)

@Serializable
data class Artifact(
    val id: Long,
    val name: String,
    @SerialName("archive_download_url") val downloadUrl: String,
    @SerialName("workflow_run") val workflow: WorkflowRun,
)

@Serializable
data class WorkflowRun(
    val id: Long,
    @SerialName("head_sha") val sha: String
)