/*
 *  Copyright 2011 Daniel Reimann
 *
 *  This file is part of JustYAML.
 *
 *  JustYAML is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Lesser General Public License as
 *  published by the Free Software Foundation, either version 3 of
 *  the License, or (at your option) any later version.
 *
 *  JustYAML is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  GNU Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with Javagency.
 *  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package codednetherland.justyaml;

/**
 *  Enum to declare which YAML version to use.
 *
 *  @author codednetherland <codednetherland@googlemail.com>
 *  @version 0.9
 *  @since 0.9
 */
public enum YAMLVersion {

    /**
     *  Auto select / detect the version.
     */
    AUTO,

    /**
     *  Use YAML version 1.0.
     */
    V1_0,

    /**
     *  Use YAML version 1.1.
     */
    V1_1,

    /**
     *  Use YAML version 1.2.
     */
    V1_2;
}
