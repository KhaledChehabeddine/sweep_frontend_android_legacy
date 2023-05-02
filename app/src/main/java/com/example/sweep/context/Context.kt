package com.example.sweep.context

import com.example.sweep.context.components.ServiceCategoryContext
import com.example.sweep.context.screens.AccountCategoryContext
import com.example.sweep.context.screens.home.HomeMainFeaturePromotionContext
import com.example.sweep.context.screens.home.HomeMainFeatureRewardContext
import com.example.sweep.context.screens.home.HomeSubFeatureContext

var accountCategoryContext = AccountCategoryContext(
  contextCollected = false,
  accountMainCategory = null,
  accountSubCategories = emptyList()
)

var homeMainFeaturePromotionContext = HomeMainFeaturePromotionContext(
  contextCollected = false,
  companyContextsById = mapOf(),
  homeMainFeaturePromotions = emptyList(),
  workerContextsById = mapOf()
)

var homeMainFeatureRewardContext = HomeMainFeatureRewardContext(
  contextCollected = false,
  homeMainFeatureRewards = emptyList()
)

var homeSubFeatureContext = HomeSubFeatureContext(
  companyContextsById = mapOf(),
  contextCollected = false,
  homeSubFeatures = emptyList(),
  workerContextsById = mapOf()
)

var serviceCategoryContext = ServiceCategoryContext(
  contextCollected = false,
  serviceCategories = emptyList()
)
