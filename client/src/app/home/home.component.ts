import {Component, Input, OnInit} from '@angular/core';
import { TestService } from '../services/test.service';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  @Input() s = '';
  count;

  constructor(private testTechniqueService: TestService) {
    this.count = 0;
  }

  ngOnInit() {
  }

  ponctuation(s) {
    return this.testTechniqueService.ponctuation(s).subscribe(response => {
      this.count = response;
    });
  }
}
