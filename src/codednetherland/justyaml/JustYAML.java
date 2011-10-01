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

import codednetherland.justyaml.convert.StandardYAMLEmitter;
import codednetherland.justyaml.convert.StandardYAMLParser;
import codednetherland.justyaml.convert.YAMLEmitter;
import codednetherland.justyaml.convert.YAMLParser;

/**
 *  The class to load and save YAML objects.
 *
 *  @author codednetherland <codednetherland@googlemail.com>
 *  @version 0.9
 *  @since 0.9
 */
public class JustYAML {

    /**
     *  The parser to use to parse YAML text to objects.
     */
    final YAMLParser parser;
    /**
     *  The emitter to use to emit YAML text from objects.
     */
    final YAMLEmitter emitter;

    /**
     *  Standard constructor which uses auto selection / detection.
     */
    public JustYAML() {
        this( YAMLVersion.AUTO );
    }

    /**
     *  Constructor which uses a special version of YAML.
     *
     *  @param version the version of YAML
     */
    public JustYAML( YAMLVersion version ) {
        this( new StandardYAMLParser( version ), new StandardYAMLEmitter( version ) );
    }

    /**
     *  Constructor which uses a special {@code YAMLParser} and a special {@code YAMLEmitter}.
     *
     * @param parser the {@code YAMLParser} to use
     * @param emitter the {@code YAMLEmitter} to use
     */
    public JustYAML( YAMLParser parser, YAMLEmitter emitter ) {
        this.parser = parser;
        this.emitter = emitter;
    }



}
