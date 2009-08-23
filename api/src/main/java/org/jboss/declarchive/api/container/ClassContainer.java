/*
 * JBoss, Home of Professional Open Source
 * Copyright 2009, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.declarchive.api.container;

import org.jboss.declarchive.api.Archive;

/**
 * ClassContainer
 * 
 * Defines the contract for a component capable of storing 
 * Java Classes.
 * <br/><br/>
 * The actual path to the Class resources within the Archive 
 * is up to the implementations/specifications.
 *
 * @author <a href="mailto:aslak@conduct.no">Aslak Knutsen</a>
 * @version $Revision: $
 */
public interface ClassContainer<T extends Archive<T>>
{
   //-------------------------------------------------------------------------------------||
   // Contracts --------------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   /**
    * Adds the specified Classes to the archive.
    * 
    * @param classes
    * @return This virtual archive
    * @throws IllegalArgumentException If no classes were specified
    */
   T add(Class<?>... classes) throws IllegalArgumentException;

   /**
    * Adds all classes in the specified Packages to the archive.
    * 
    * @param recursive Should the packages be added recursively
    * @param packages All the packages to add
    * @return This virtual archive
    * @throws IllegalArgumentException If no packages were specified
    */
   T add(boolean recursive, Package... packages) throws IllegalArgumentException;
}