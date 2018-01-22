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

package au.fsat.sbt.packager.bintray.rpm

import sbt.SettingKey

/**
  * Keys of the [[RpmBintrayPublishPlugin]].
  */
trait RpmBintrayPublishKeys {
  lazy val rpmBintrayOrganization = SettingKey[Option[String]]("rpm-bintray-organization", "The organization which owns the RPM repository within Bintray.")
  lazy val rpmBintrayRepo = SettingKey[String]("rpm-bintray-repo", "The name of the RPM repository within Bintray.")
  lazy val rpmBintrayPackage = SettingKey[String]("rpm-bintray-package", "The name of the RPM package.")
  lazy val rpmBintrayPublish = SettingKey[Boolean]("rpm-bintray-publish", "If set to true, publish the RPM artefact to Bintray.")
}
