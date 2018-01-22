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

package au.fsat.sbt.packager.bintray.debian

import sbt.SettingKey

/**
  * Keys of the [[DebianBintrayPublishPlugin]].
  */
trait DebianBintrayPublishKeys {
  lazy val debianBintrayOrganization = SettingKey[Option[String]]("debian-bintray-organization", "The organization which owns the Debian repository within Bintray.")
  lazy val debianBintrayRepo = SettingKey[String]("debian-bintray-repo", "The name of the Debian repository within Bintray.")
  lazy val debianBintrayPackage = SettingKey[String]("debian-bintray-package", "The name of the Debian package.")
  lazy val debianBintrayPublish = SettingKey[Boolean]("debian-bintray-publish", "If set to true, publish the Debian artefact to Bintray.")
  lazy val debianBintrayDistributions = SettingKey[Seq[String]]("debian-bintray-distributions", "List of Debian distro supported, i.e. jessie, trusty.")
  lazy val debianBintrayComponent = SettingKey[String]("debian-bintray-component", "The Debian component name of the archive.")
  lazy val debianBintrayArchitecture = SettingKey[String]("debian-bintray-architecture", "The architecture supported by the Debian package.")
}
