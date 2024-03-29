package com.example.sweep.data.components

import com.example.sweep.data.components.metadata.ServiceCategoryMetadata
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ServiceCategory(
  @SerialName("active")
  val active: Boolean,
  @SerialName("_id")
  val id: String,
  @SerialName("image")
  val image: String = "",
  @SerialName("image_path")
  val imagePath: String,
  @SerialName("image_url")
  val imageUrl: String,
  @SerialName("metadata")
  val metadata: ServiceCategoryMetadata,
  @SerialName("name")
  val name: String
)
