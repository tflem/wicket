/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package wicket.util.resource.locator;

import java.util.Iterator;
import java.util.Locale;

/**
 * While searching for Wicket resource files various combinations of path,
 * style, variation, locale and file extensions must be tested.
 * 
 * @author Juergen Donnerstag
 */
public interface IWicketResourceNameIterator extends Iterator<String>
{
	/**
	 * While iterating the various combinations, it will always contain the
	 * current combination used to create the path
	 * 
	 * @return Locale
	 */
	Locale getLocale();

}