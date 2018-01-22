/*
 * Copyright 2018 Felix Satyaputra
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package au.fsat.sbt.packager.bintray.universal

import sbt.SettingKey

/**
  * Keys of the [[UniversalBintrayPublishPlugin]].
  */
trait UniversalBintrayPublishKeys {
  lazy val universalBintrayOrganization = SettingKey[Option[String]]("universal-bintray-organization", "The organization which owns the Universal repository within Bintray.")
  lazy val universalBintrayRepo = SettingKey[String]("universal-bintray-repo", "The name of the Universal repository within Bintray.")
  lazy val universalBintrayPackage = SettingKey[String]("universal-bintray-package", "The name of the Universal package.")
  lazy val universalBintrayPublishZip = SettingKey[Boolean]("universal-bintray-publish-zip", "If set to true, publish the Universal zip artefact to Bintray.")
  lazy val universalBintrayPublishTgz = SettingKey[Boolean]("universal-bintray-publish-tgz", "If set to true, publish the Universal tgz artefact to Bintray.")
}
