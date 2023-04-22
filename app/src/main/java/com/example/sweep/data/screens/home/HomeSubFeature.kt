package com.example.sweep.data.screens.home

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class HomeSubFeature(
  @SerialName("_id")
  val id: String,
  @SerialName("service_firm_ids")
  val serviceFirmIds: List<String>,
  @SerialName("service_worker_ids")
  val serviceWorkerIds: List<String>,
  @SerialName("subtitle")
  val subtitle: String,
  @SerialName("title")
  val title: String
)
