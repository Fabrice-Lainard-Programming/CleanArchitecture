/*--------------------------------------------------------------------------
* Project: Clean Architecture
* Author Fabrice Lainard Created : 18/01/2020
*
* Copyright (c) Fabtice Lainard Programming. All rights reserved.
* Licensed under the MIT License.
--------------------------------------------------------------------------*/

package com.flprogramming;

 

/**
 * Clean Architecture : basic use case definition
 * @author lainard
 * @param <Input>
 * @param <Output>
 */
public interface UseCase<Input, Output> {
    
     
    void execute(Input parameter) throws Exception;
}