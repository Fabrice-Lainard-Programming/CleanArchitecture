/*--------------------------------------------------------------------------
* Project: Clean Architecture
* Author Fabrice Lainard Created : 18/01/2020
*
* Copyright (c) Fabtice Lainard Programming. All rights reserved.
* Licensed under the MIT License.
--------------------------------------------------------------------------*/
package com.flprogramming;

/**
 * Clean Architecture : Presenter sample
 * @author lainard
 */
 public class Presenter extends OutputPort<Long>
    {
         @Override
         public void onExecuted(Long value) 
         {
             System.out.print("Presenter :  received value is : " + value);
         }
    }