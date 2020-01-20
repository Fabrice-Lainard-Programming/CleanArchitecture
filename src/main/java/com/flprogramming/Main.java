/*--------------------------------------------------------------------------
* Project: Clean Architecture
* Author Fabrice Lainard Created : 18/01/2020
*
* Copyright (c) Fabtice Lainard Programming. All rights reserved.
* Licensed under the MIT License.
--------------------------------------------------------------------------*/
package com.flprogramming;

/**
 * Clean Architecture : Main entry point used to test the use case imlementation
 *
 * @author lainard
 */
public class Main {
    public static void main(String[] args) throws Exception {
        // create a presenter which reprensents our UI for example
        Presenter presenter  = new Presenter();
        // Create and execute our Usecase
        BusinessUseCase useCase = new BusinessUseCase(presenter);
        useCase.execute(10L);
        // Presenter will be called at the end of the Use case execution
    }

}
