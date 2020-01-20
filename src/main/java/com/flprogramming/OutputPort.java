/*--------------------------------------------------------------------------
* Project: Clean Architecture
* Author Fabrice Lainard Created : 18/01/2020
*
* Copyright (c) Fabtice Lainard Programming. All rights reserved.
* Licensed under the MIT License.
--------------------------------------------------------------------------*/


package com.flprogramming;

/**
 * Clearn Architecture : use case ouput port 
 * @author lainard
 */
public abstract class OutputPort<Output>  {
      public void onExecuted(Output out) {}
}
