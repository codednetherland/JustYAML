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
package codednetherland.justyaml.convert;

import codednetherland.justyaml.YAMLVersion;

/**
 *  Standard way to parse YAML text to objects.
 *
 *  @author codednetherland <codednetherland@googlemail.com>
 *  @version 0.9
 *  @since 0.9
 */
public class StandardYAMLParser implements YAMLParser {

    /**
     *  The {@code YAMLVersion} to parse.
     */
    final YAMLVersion version;

    /**
     *  Standard constructor using {@code YAMLVersion.AUTO}.
     */
    public StandardYAMLParser() {
        this( YAMLVersion.AUTO );
    }

    /**
     *  Constructor to parse a special version of YAML.
     *
     *  @param version the {@code YAMLVersion} to parse
     */
    public StandardYAMLParser( YAMLVersion version ) {
        this.version = version;
    }

}
